<template>
    <div class="popular-product">
      <div class="popular-product__image">
        <img src="@images/product1.svg" alt="product">
      </div>
      <div class="popular-product__description">
        <div class="action-container">
          <span class="action-container__link-more-info">
            Подробнее
          </span>
          <div class="popular-product__heart-icon-button">
            <img src="@images/icons/heart--outline.svg" alt="heart-icon">
          </div>
        </div>
        <p class="popular-product__title">HARIBO Goldbears</p>
        <p class="popular-product__price">460тг</p>
        <button class="popular-product__to-basket-button">В корзину</button>
        <a href="" class="popular-product__quick-buy-link">В один клик</a>
      </div>
    </div>
</template>

<script>
    export default {

    };
</script>

<style scoped>
  .popular-product {
    width: 306px;
    height: 174px;
    display: flex;
    align-items: center;
    background-color: #ffffff;
    box-shadow: var(--common-shadow);
    border-radius: 5px;
  }
  .popular-product__description {
    width: 107px;
  }
  .popular-product__image {
    width: 188px;
  }
  .action-container {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 96px;
    margin-left: 12px;
  }
  .action-container__link-more-info {
    font-size: 10px;
    cursor: pointer;
  }
  .popular-product__heart-icon-button {
    height: 19px;
    cursor: pointer;
  }
  .popular-product__title {
    font-size: 12px;
    margin: 30px 0 12px 0;
    font-weight: 600;
    text-align: left;
  }
  .popular-product__price {
    font-size: 20px;
    color: var(--primary-price);
    font-weight: 800;
    text-align: right;
    margin-bottom: 4px;
  }
  .popular-product__to-basket-button {
    width: 106px;
    height: 30px;
    border-radius: 3px;
    border: none;
    background-image: var(--accent-gradient);
    color: #ffffff;
    outline: none;
    cursor: pointer;
  }
  .popular-product__quick-buy-link {
    font-size: 10px;
  }
</style>
