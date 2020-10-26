package com.example.cxk.demo.controller;

import com.example.cxk.demo.error.ParamErrorException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Slf4j
public class BaseController {
    protected void checkParameter(BindingResult bindingResult){
        // 校验提交的数据
        if (bindingResult.hasErrors()) {
            if (bindingResult.getTarget() == null) {
                throw new ParamErrorException("参数读取异常");
            }

            // 获取有错误信息的字段名
            List<String> fields = bindingResult.getFieldErrors().stream()
                    .map(FieldError::getField)
                    .collect(Collectors.toList());

            // 存放错误信息列表
            List<FieldErrorMessage> errorMessages = new ArrayList<>();

            // 获取要验证类的所有字段
            Field[] arrayField = bindingResult.getTarget().getClass().getDeclaredFields();

            // 遍历字段
            for (int i = 0; i < arrayField.length; i++) {
                Field field = arrayField[i];

                // 获取字段名
                String fieldName = field.getName();

                if (fields.contains(fieldName)) {
                    // 根据字段名获取错误信息
                    FieldError fieldError = bindingResult.getFieldError(fieldName);

                    if (fieldError == null) {
                        continue;
                    }

                    // 获取排序值
                    int sortValue = (i + 1);

                    // 添加到错误信息列表中
                    errorMessages.add(new FieldErrorMessage(sortValue, fieldName, fieldError.getDefaultMessage()));
                }
            }

            // 参数校验失败，返回错误信息
            String message = "数据异常";

            if (errorMessages.size() > 0) {

                // 排序
                List<FieldErrorMessage> sortMessages = errorMessages.stream()
                        .sorted(Comparator.comparingInt(FieldErrorMessage::getSortValue))
                        .collect(Collectors.toList());

                message = sortMessages.get(0).getErrorMessage();

                // 获取所有错误信息
                String allErrorMessageStr = sortMessages.stream()
                        .map(FieldErrorMessage::getErrorMessage)
                        .collect(Collectors.joining(","));

                log.error("参数异常。all errors message：{}", allErrorMessageStr);
            }

            throw new ParamErrorException("提交异常。错误：" + message);
        }
    }
    @Data
    private class FieldErrorMessage {
        private Integer sortValue;
        private String fieldName;
        private String errorMessage;

        private FieldErrorMessage(Integer sortValue, String fieldName, String errorMessage) {
            this.sortValue = sortValue;
            this.fieldName = fieldName;
            this.errorMessage = errorMessage;
        }
    }
}
