<template>
    <div>
        <div>
            <input type="date" v-model="newPlan.date" placeholder="请输入日期"/>
            <input type="number" v-model="newPlan.num" placeholder="请输入次数"/>
            <button @click="addPlans">添加计划</button>
        </div>
        <table>
            <thead>
                <tr>
                    <th>date</th>
                    <th>num</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in plans" :key="item.id">
                    <td>{{item.date}}</td>
                    <td>{{item.num}}</td>
                    <td>
                        <button @click="delPlans(item.date)">删除</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data () {
        return {
            plans: [],
            newPlan: {
                date: '',
                num: null
            },
            error: null
        }
    },
    methods: {
        async fetchPlans() {
            try {
                const response = await axios.get('http://localhost:8080/api/plans');
                this.plans = response.data;
            } catch (err) {
                this.error = '无法获取计划数据。';
            }
        },
        async addPlans() {
            try {
                const response = await axios.post('http://localhost:8080/api/plans',this.newPlan);
                this.plans = response.data;
                
            } catch (err) {
                this.error = '无法获取计划数据。';
            }
            location.reload();
        },
        async delPlans(date) {
            try {
                await axios.delete(`http://localhost:8080/api/plans/${date}`);
                this.plans = this.plans.filter(item => item.date !== date);
                
            } catch (err) {
                this.error = '删除计划失败。';
            }
            location.reload();
        }
    },
    mounted() {
        this.fetchPlans();
    }
    
}
</script>

<style lang="scss" scoped>

</style>