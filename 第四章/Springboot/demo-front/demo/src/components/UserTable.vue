<template>
    <div>
      <h1>用户管理</h1>
  
      <!-- 添加新用户的表单 -->
      <div>
        <input v-model="newUser.name" placeholder="姓名" />
        <input v-model="newUser.age" type="number" placeholder="年龄" />
        <button @click="addUser">添加用户</button>
      </div>
  
      <!-- 用户列表表格 -->
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="user in users" :key="user.id">
            <td>{{ user.id }}</td>
            <td>
              <input v-model="user.name" />
            </td>
            <td>
              <input v-model="user.age" type="number" />
            </td>
            <td>
              <button @click="updateUser(user)">保存</button>
              <button @click="deleteUser(user.id)">删除</button>
            </td>
          </tr>
        </tbody>
      </table>
  
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
        users: [],       // 用户数据列表
        newUser: {       // 用于存储新用户的临时数据
          name: '',
          age: null
        },
        error: null      // 存储错误信息
      };
    },
    methods: {
      // 获取所有用户
      async fetchUsers() {
        try {
          const response = await axios.get('http://localhost:8080/api/users');
          this.users = response.data;  // 将获取的数据赋值给 users
        } catch (err) {
          this.error = '无法获取用户数据。';
        }
      },
      // 添加新用户
      async addUser() {
        try {
          const response = await axios.post('http://localhost:8080/api/users', this.newUser);
          this.users.push(response.data); // 将新用户添加到 users 列表中
          this.newUser = { name: '', age: null }; // 重置新用户数据
        } catch (err) {
          this.error = '添加用户失败。';
        }
      },
      // 更新用户信息
      async updateUser(user) {
        try {
          await axios.put(`http://localhost:8080/api/users/${user.id}`, user);
          alert('用户信息已更新');
        } catch (err) {
          this.error = '更新用户信息失败。';
        }
      },
      // 删除用户
      async deleteUser(userId) {
        try {
          await axios.delete(`http://localhost:8080/api/users/${userId}`);
          this.users = this.users.filter(user => user.id !== userId); // 从列表中移除删除的用户
        } catch (err) {
          this.error = '删除用户失败。';
        }
      }
    },
    // 生命周期钩子，在组件挂载时获取用户数据
    mounted() {
      this.fetchUsers();
    }
  };
  </script>
  
  <style scoped>
  table {
    width: 100%;
    border-collapse: collapse;
  }
  th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
  }
  .error {
    color: red;
    font-weight: bold;
  }
  </style>
  