<template>
    <div class="dialog-bg">
        <dvi class="dialog">
            <div>测试标题</div>
            <div>
                <slot :text2="text" name="header">{{text}}</slot>
            </div>
            
            <div><input type="text" v-model="modelValue2"></div>
            <div class="btn-group">
                <button @click="submit()" >确定</button>
                <button @click="cancel()">取消</button>
            </div>
        </dvi>
    </div>
</template>

<script>
export default {
    // props:{
    //     weather1:{
    //         type:String,
    //         default:''
    //     }
    // },
    data() {
        return {
            text:'changed'
        }
    },
    methods: {
        clickMe() {
            this.text = 'test'
        },
        cancel(){
            this.$emit('cancel')
        },
        submit(){
            this.$emit('update:model-value', this.modelValue2)
        }
    },
    watch:{
        text(newVal,oldVal){
            console.log(newVal,oldVal)
        }
    },
}
</script>

<style scoped>
    .dialog-bg{
        position: fixed;
        top: 0;
        left: 0;
        width: 100vw;
        height: 100vh;
        text-align: center;
    }
    .dialog{
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        width: 300px;
        height: 200px;
        background-color: #ffd2d2;
        border-radius: 10px;
        padding: 20px;
    }
    .btn-group{
        margin-top: 50px;
        display: flex;
        justify-content: space-around;
    }
</style>