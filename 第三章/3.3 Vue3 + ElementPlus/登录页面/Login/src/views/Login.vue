<template>
  <link rel="stylesheet" href="/src/assets/css/login.scss">
    <div class="container">
      <div class="div1">
        <h1>欢迎登录</h1>
        <span>广告业务后台系统</span>
      </div>
      
      <el-menu default-active="1" class="el-menu-demo" mode="horizontal" @select="handleSelect" :ellipsis="false">
        <el-menu-item index="1" @click="change(1)">密码登录</el-menu-item>
        <el-menu-item index="2" @click="change(2)">短信登录</el-menu-item>
      </el-menu>
  
      <div v-if="activeIndex == 1">
        <el-input
          v-model="input1"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入账号"
          clearable
          class="inputbox"
        />
        <el-input
          v-model="input2"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入密码"
          clearable
          show-password
          class="inputbox"
        />
        <div class="forget" @click="forget">忘记密码</div>
        <el-button type="primary" class="login-btn" @click="jump1()">登录</el-button>
      </div>
      <div class="div22" v-if="activeIndex == 2">
        <el-input
          v-model="input3"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入手机号"
          clearable
          class="inputbox"
        />
        <el-input
          v-model="input4"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入验证码"
          clearable
          class="inputbox"
        />
        <!-- 验证码 -->
        <div id="cpc" @click="changeCaptcha">{{ captcha }}</div>
        <el-button type="primary" class="login-btn" @click="jump2">登录</el-button>
      </div>
      
    </div>
  </template>
  
  <script>
  import { el } from 'element-plus/es/locales.mjs';
  import { ref } from 'vue';
  
  
  
  export default {
    setup() {
      const activeIndex = ref(1);
      // 账号
      const input1 = ref('');
      // 密码
      const input2 = ref('');
      // 手机号
      const input3 = ref('');
      // 验证码
      const input4 = ref('');
      // const captcha = ref(Math.floor(Math.random() * 10000));
  
      const change = (index) => {
        activeIndex.value = index;
      };
  
      const handleSelect = (key) => {
        activeIndex.value = parseInt(key);
      };
     
      return {
        activeIndex,
        input1,
        input2,
        input3,
        input4,
        change,
        handleSelect,
        captcha: ref((Math.floor(Math.random() * 10000)).toString().padStart(4, '0'))
      };
    },
    methods: {
        changeCaptcha() {
          this.captcha = (Math.floor(Math.random() * 10000)).toString().padStart(4, '0');
          // console.log(this.captcha);
        },
        jump1() {
          // console.log("登录按钮");
          if(this.input1 == '12345678910' && this.input2 == '123456') {
            alert("登录成功");
            window.open("https://dict.youdao.com/");
            this.input1 = '';
            this.input2 = '';
          }else {
            alert("请输入正确的账号和密码");
            this.input1 = '';
            this.input2 = '';
          }
        },
        jump2() {
          // console.log("登录按钮");
          if(this.input3 == '12345678910' && this.input4 == this.captcha) {
            alert("登录成功");
            window.open("https://dict.youdao.com/");
            this.input3 = '';
            this.input4 = '';
          }else {
            alert("请输入正确的手机号和验证码");
            this.input3 = '';
            this.input4 = '';
            console.log(this.captcha);
            
          }
        },
        forget() {
          window.open("https://support.microsoft.com/zh-cn/windows/%E6%9B%B4%E6%94%B9%E6%88%96%E9%87%8D%E7%BD%AE%E5%AF%86%E7%A0%81-8271d17c-9f9e-443f-835a-8318c8f68b9c");
        }
        
    },
  };
  </script>
  
  <style src="/src/assets/scss/login.css" lang="scss" scoped>
 
  
  </style>
  