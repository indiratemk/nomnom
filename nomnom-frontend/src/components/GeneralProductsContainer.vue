<template>
  <div class="products-container">
    <div class="products-container__row">
      <general-product/>
      <general-product/>
      <general-product/>
    </div>
    <div class="products-container__row">
      <general-product/>
      <general-product/>
      <general-product/>
    </div>
  </div>
</template>

<script>
import GeneralProduct from './GeneralProduct';

export default {
  name: 'GeneralProductsContainer',
  components: {
    GeneralProduct
  }
};
</script>

<style scoped>
  .products-container__row {
    display: flex;
    justify-content: space-between;
    margin-top: 38px;
  }
</style>
