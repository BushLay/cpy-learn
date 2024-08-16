<template>
    <div class="container">
      <div class="div1">
        <h1>欢迎登录</h1>
        <span>广告业务后台系统</span>
      </div>
      
      <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect" :ellipsis="false">
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
        />
        <el-input
          v-model="input1"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入密码"
          clearable
        />
      </div>
      <div v-if="activeIndex == 2">
        <el-input
          v-model="input1"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入手机号"
          clearable
        />
        <el-input
          v-model="input1"
          style="width: 240px; float: left"
          size="large"
          placeholder="请输入验证码"
          clearable
        />
        <div id="cpc" onclick="changeCaptcha()"></div>
      </div>
    </div>
  </template>
  
  <script>
  import { ref } from 'vue';
  
  export default {
    setup() {
      const activeIndex = ref(1);
      const input1 = ref('');
  
      const change = (index) => {
        activeIndex.value = index;
      };
  
      const handleSelect = (key) => {
        activeIndex.value = parseInt(key);
      };
  
      return {
        activeIndex,
        input1,
        change,
        handleSelect,
        
      };
    },
    methods: {
        
    },
  };
  </script>
  
  <style lang="scss" scoped>
  h1,
  input,
  button {
    margin: 0;
    border: 0;
  }
  
  .container {
    background-color: rgba(255, 255, 255, 0.8);
    height: 400px;
    width: 320px;
    padding: 40px 40px;
  }
  
  .div1 {
    display: flex;
  
    h1 {
      font-size: 30px;
    }
  
    span {
      display: flex;
      align-items: flex-end;
      margin-left: 10px;
      color: rgb(168, 168, 168);
    }
  }
  
  .el-menu-demo {
    width: 190px;
    margin-top: 20px;
  }
  
//   .el-menu-item.is-active {
//     background-color: #409EFF !important; /* 选中背景色 */
//     color: #ffffff !important;            /* 选中文本颜色 */
//     border-radius: 5px;                   /* 圆角效果 */
//   }
  </style>
  