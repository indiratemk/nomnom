<template>
  <div class="main-content">
    <ul class="menu">
      <router-link 
        tag="li" 
        class="menu__item" 
        to="/test">Шоколад</router-link>
      <router-link 
        tag="li" 
        class="menu__item" 
        to="#">Мармелад</router-link>
      <router-link 
        tag="li" 
        class="menu__item" 
        to="#">Чупа-чупсы</router-link>
      <router-link 
        tag="li" 
        class="menu__item" 
        to="#">Печенье</router-link>
      <router-link 
        tag="li" 
        class="menu__item" 
        to="#">Конфеты</router-link>
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

  .menu__item {
    color: var(--primary-dark);
    cursor: pointer;
  }
</style>
