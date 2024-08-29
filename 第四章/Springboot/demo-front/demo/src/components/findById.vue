<template>
    <div>
      <h1>查询用户信息</h1>
      <div>
        <label for="userId">输入用户ID:</label>
        <input v-model="userId" type="number" id="userId" />
        <button @click="fetchUser">查询</button>
      </div>
      <div v-if="user">
        <h2>用户信息</h2>
        <p>ID: {{ user.id }}</p>
        <p>名字: {{ user.name }}</p>
        <p>年龄: {{ user.age }}</p>
      </div>
      <div v-if="error" class="error">
        <p>{{ error }}</p>
      </div>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        userId: null,  // 用于存储输入的用户ID
        user: null,    // 存储获取到的用户信息
        error: null    // 存储错误信息
      };
    },
    methods: {
      async fetchUser() {
        this.error = null; // 清除之前的错误信息
        this.user = null;  // 清除之前的用户数据
        try {
          const response = await axios.get(`http://localhost:8080/api/users/${this.userId}`);
          this.user = response.data;  // 将返回的用户数据存储到 user 中
        } catch (err) {
          this.error = '无法获取用户信息，请检查ID是否正确。'; // 设置错误信息
        }
      }
    }
  };
  </script>
  
  <style scoped>
  .error {
    color: red;
    font-weight: bold;
  }
  </style>
  