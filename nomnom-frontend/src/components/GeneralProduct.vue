<template>
  <div class="product-content">
    <div class="content-top">
      <div class="content-top__image">
        <img 
          src="@images/product1.svg" 
          alt="product" 
          width="282">
      </div>
      <div class="content-top__heart-icon">
        <img
          src="@images/icons/heart--outline.svg" 
          alt="heart-icon">
      </div>
    </div>
    <div class="content-middle">
      <p class="content-middle__price">460тг</p>
      <span class="content-middle__more-info">Подробнее</span>
    </div>
    <div class="content-bottom">
      <p class="content-bottom__title">HARIBO Goldbears</p>
      <hr>
      <div class="content-button">
        <button class="content-button__quantity">10</button>
        <button class="content-button__to-basket">В корзину</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
};
</script>

<style scoped>
  .product-content {
    width: 282px;
    height: 282px;
    border: 1px solid #000;
    border-radius: 3px;
  }
  .content-top {
    position: relative;
  }


</style>
