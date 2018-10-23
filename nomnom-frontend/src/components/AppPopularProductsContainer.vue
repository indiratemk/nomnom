<template>
  <div class="popular-products-container">
    <div class="popular-products-container__title">
      <span class="popular-products-container__text">Популярные товары</span>
      <hr class="popular-products-container__line">
    </div>
    <div class="popular-products-container__items">
      <app-popular-product></app-popular-product>
      <app-popular-product></app-popular-product>
      <app-popular-product></app-popular-product>
    </div>
  </div>
</template>

<script>
    import AppPopularProduct from "../components/AppPopularProduct";

    export default {
      components: {
        AppPopularProduct
    }
  };
</script>

<style scoped>
  .popular-products-container__line {
    display: block;
    opacity: 0.2;
    border: none;
    height: 1px;
    background-color: var(--primary-dark);
    width: 730px;
  }
  .popular-products-container__text {
    font-size: 25px;
  }
  .popular-products-container__title {
    display: flex;
    align-items: center;
    justify-content: space-between;
    margin-bottom: 13px;
  }
  .popular-products-container__items {
    display: flex;
    justify-content: space-between;
  }
</style>
