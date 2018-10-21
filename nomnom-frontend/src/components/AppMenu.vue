<template>
    <div class="main-content">
      <ul class="menu">
        <li class="menu__item"><a href="">Шоколад</a></li>
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
  .main-content{
    width: 1000px;
    margin: 0 auto;
  }
  .menu{
    display: flex;
    list-style: none;
    margin-top: 8px;
    width: 492px;
    height: 20px;
    justify-content: space-between;
    align-items: center;
  }

  .menu__item a{
    text-decoration: none;
  }
</style>
