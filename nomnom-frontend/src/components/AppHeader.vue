<template>
    <div class="header">
      <div class="header__content">
        <div class="header__left">
          <img src="@images/logos/nomnom-logo-small.svg" alt="logo">
        </div>
        <div class="header__middle">
          <input class="search-form" type="text" placeholder="Поиск...">
        </div>
        <div class="header__right">
          <div class="basket">
            <div class="basket__basket-icon">
              <img class="basket__image" src="@images/icons/shopping-basket.svg" alt="basket">
            </div>
            <span class="basket__item-count">10</span>
          </div>
          <button class="login-button">Войти</button>
        </div>
      </div>
    </div>
</template>

<script>
  export default {

  };
</script>

<style scoped>
  .header {
    height: 80px;
    width: 100%;
    background-size: cover;
    background: url("~@images/header-background.svg") no-repeat;
  }
  .header__content {
    width: 1000px;
    height: 65px;
    display: flex;
    margin: 0 auto;
    justify-content: space-between;
    align-items: center;
  }
  .header__right {
    display: flex;
    align-items: center;
    width: 150px;
    justify-content: space-between;
  }
  .search-form {
    width: 480px;
    height: 40px;
    border-radius: 5px;
    border: none;
    font-size: 16px;
    text-align: left;
    padding-left: 10px;
    box-sizing: border-box;
    box-shadow: var(--common-shadow);
    outline: none;
    background: #fff;
  }
  .basket {
    width: 32px;
    height: 32px;
    cursor: pointer;
  }
  .basket__item-count {
    height: 15px;
    width: 15px;
    display: block;
    border-radius: 50%;
    background-color: var(--primary-light-gray);
    font-size: 10px;
    color: var(--primary-dark);
    box-sizing: border-box;
    padding-top: 2px;
    position: relative;
    bottom: 35px;
    left: 18px;
  }
  .login-button {
    width: 100px;
    height: 40px;
    background-color: transparent;
    border-radius: 5px;
    border: 1px solid #ffffff;
    font-size: 16px;
    color: #ffffff;
    outline:none;
    cursor: pointer;
  }

</style>
