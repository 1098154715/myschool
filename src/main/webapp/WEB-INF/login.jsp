<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>颐老云登录页面</title>

    <meta charset="utf-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/vue_element_index.css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/mycss/login.css" media="all" />
    <style>
       el-row {
            margin-bottom: 20px;

        }
        .login-box {
            margin-top:20%;
            margin-left:40%;
        }
    </style>
</head>
<body>
<div class="login-box" id="app" >
    <el-row>
        <el-col :span="8">
            <el-input id="name" v-model="name" placeholder="请输入帐号">
                <template slot="prepend">帐号</template>
            </el-input>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="8">
            <el-input id="password" v-model="password" type="password" placeholder="请输入密码">
                <template slot="prepend">密码</template>
            </el-input>
        </el-col>
    </el-row>
    <el-row>
        <el-col :span="4">
            <el-button id="login" v-on:click="check" style="width:100%" type="primary">登录</el-button>
        </el-col>
        <el-col :span="4">
            <el-button  type="info" id="reg" v-on:click="check" style="width:100%" type="primary">注册</el-button>
        </el-col>
    </el-row>
</div>

</body>
<%--<script src="${pageContext.request.contextPath}/vue.js"></script>--%>
<%-- //导入基本的vue的支持，需要再index.js的前面导入--%>
<script src="${pageContext.request.contextPath}/plugins/vue_elemtnt_ui_index.js"></script>
<%-- //导入js文件--%>
<script src="${pageContext.request.contextPath}/plugins/vue.js"></script>
<script type="text/javascript" src="plugins/jquery_2.1.4.js"></script>
<script>
    new Vue({
        el : '#app',
        data : {
            name : '',
            password : ''
        },
        methods : {
            check : function(event){
                debugger;
                //获取值
                var name = this.name;
                var password = this.password;
                if(name == '' || password == ''){
                    this.$message({
                        message : '账号或密码为空',
                        type : 'error'
                    })
                    return;
                }
                $.ajax({
                    url : '/login',
                    type : 'post',
                    data : {
                        name : name,
                        password : password
                    },
                    success : function(data) {
                        var result = data.result;
                        if(result == 'true' || result == true){
                            alert("登录成功");
                        }else {
                            alert("登录失败");
                        }
                    },
                    error : function(data) {
                        alert(data);
                    },
                    dataType : 'json',
                })
            }
        }
    })

</script>



</html>