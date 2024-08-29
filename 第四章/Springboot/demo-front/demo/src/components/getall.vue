<template>
    <div>
      <h1>用户列表</h1>
      <ul>
        <li v-for="user in users" :key="user.id">
          {{ user.name }} (Age: {{ user.age }})
        </li>
      </ul> 
    </div>
  </template>
  
  <script>
  import { ref, onMounted } from 'vue';
  import axios from 'axios';
  
  export default {
    setup() {
      const users = ref([]); // 定义一个响应式变量来存储用户数据
  
      // 定义一个函数来获取用户数据
      const fetchUsers = async () => {
        try {
          const response = await axios.get('http://localhost:8080/api/users'); // 替换为你的后端API地址
          users.value = response.data; // 将响应的数据存储到users变量中
        } catch (error) {
          console.error('Failed to fetch users:', error); // 处理请求错误
        }
      };
  
      onMounted(() => {
        fetchUsers(); // 在组件挂载时调用fetchUsers函数
      });
  
      return {
        users // 将users返回，以便在模板中使用
      };
    }
  };
  </script>
  