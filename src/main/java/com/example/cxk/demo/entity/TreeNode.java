package com.example.cxk.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * @author cxk
 * @date 2020/7/11 15:41
 */
@Data
public class TreeNode {
    private String nodeName;
    private String nodeCode;

    private List<TreeNode> children;
}
