<template>
    <div class="main-content">
      <ul class="menu">
        <li class="menu__item"><router-link to="/test">Шоколад</router-link></li>
        <li class="menu__item"><a href="">Мармелад</a></li>
        <li class="menu__item"><a href="">Чупа-чупсы</a></li>
        <li class="menu__item"><a href="">Печенье</a></li>
        <li class="menu__item"><a href="">Конфеты</a></li>
      </ul>
    </div>
</template>

<script>
    export default {

    };
</script>

<style scoped>
  .menu {
    display: flex;
    margin: 8px;
    width: 492px;
    height: 20px;
    justify-content: space-between;
    align-items: center;
  }
</style>
