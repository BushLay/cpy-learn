<template>
    <div>
        <span @click="skip(1)">Page1</span>
        <br>
        <span @click="skip(2)">Page2</span>
    <router-view></router-view>
    </div>
</template>

<script>
export default {
    setup () {
        return {}
    },
    methods: {
        skip(num) {
            this.$router.push('/main/page'+num)
        }
    }
}
</script>

<style lang="scss" scoped>

</style>