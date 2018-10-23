<template>
    <div class="banner">
      <div class="banner__title">
        <img src="@images/logos/nomnom-logo.svg" alt="logo">
        <p class="banner__text">Интернет-магазин сладостей</p>
      </div>
      <div class="banner__image">
        <img src="@images/nomnom-banner.svg" alt="banner">
      </div>
    </div>
</template>

<script>
    export default {
    };
</script>

<style scoped>
  .banner {
    height: 370px;
    display: flex;
    position: relative;
  }
  .banner__text {
    font-size: 25px;
  }
  .banner__title {
    box-sizing: border-box;
    margin-top: 80px;
    text-align: left;
  }
  .banner__image {
    position: absolute;
    right: 0;
  }
</style>
