<template>
    <div>
      <h1>Add User</h1>
      <form @submit.prevent="submitUser">
        <label>
          Name:
          <input v-model="user.name" type="text" />
        </label>
        <label>
          Age:
          <input v-model="user.age" type="number" />
        </label>
        <button type="submit">Submit</button>
      </form>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  import { ref } from 'vue';
  
  export default {
    setup() {
      const user = ref({ name: '', age: null });
  
      const submitUser = async () => {
        try {
          const response = await axios.post('http://localhost:8080/api/users', user.value);
          console.log('User added:', response.data);
        } catch (error) {
          console.error('Failed to add user:', error);
        }
      };
  
      return {
        user,
        submitUser
      };
    }
  };
  </script>
  