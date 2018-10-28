<template>
  <div class="product-description">
    <div class="description-content">
      <div class="description-content__image"/>
      <div class="description-content__heart-icon">
        <img
          src="@images/icons/heart--outline.svg" 
          alt="heart-icon">
      </div>
      <div class="description-header">
        <p class="description-header__price">460тг</p>
        <span class="description-header__more-info">Подробнее</span>
      </div>
    </div>

    <div class="description-footer">
      <p class="description-footer__title">HARIBO Goldbears</p>
      <hr class="description-footer__line">
      <div class="content-button">
        <button class="content-button__quantity">10</button>
        <button class="button button_color_accent">В корзину</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
};
</script>

<style scoped>
  .product-description {
    width: 282px;
    height: 282px;
    border-radius: 3px;
    position: relative;
    box-shadow: var(--common-shadow);
  }
  .description-content {
    position: relative;
    height: 228px;

  }
  .description-content__heart-icon {
    position: absolute;
    top: 5px;
    right: 5px;
  }
  .description-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    position: absolute;
    bottom: 34px;
    height: 35px;
    width: 100%;
    background-color: rgba(67, 67, 67, 0.5);
    box-sizing: border-box;
    padding: 0 16px 0 8px;
  }
  .description-header__price {
    color: #ffffff;
    font-size: 20px;
    font-weight: 800;
  }
  .description-header__more-info {
    color: #ffffff;
    cursor: pointer;
    font-size: 14px;
  }
  .description-footer {
    height: 89px;
    width: 100%;
    position: absolute;
    background-color: #ffffff;
    bottom: 0;
  }
  .description-footer__title {
    text-align: left;
    margin: 8px 0 0 12px;
  }
  .description-footer__line {
    display: block;
    margin: 12px auto 9px auto;
    opacity: 0.2;
    border: none;
    height: 1px;
    background-color: var(--primary-dark);
    width: 255px;
  }
  .content-button {
    display: flex;
    justify-content: space-between;
    align-items: center;
    box-sizing: border-box;
    padding: 0 12px 0 12px;
  }
  .content-button__quantity {
    background-image: linear-gradient(90deg, #A170CC 0%, #9E5ED6 150%);
    width: 43px;
    height: 27px;
    border-radius: 3px;
    border: none;
    color: #ffffff;
    outline: none;
    font-size: 14px;
    cursor: pointer;
  }
  .description-content__image {
    width: 100%;
    height: 193px;
    background: url("~@images/product1.svg") 50% 40%;
    background-size: cover;
  }


</style>
