<template>
    <div class="footer">
      <div class="footer__content">
        <ul class="footer-list">
          <li class="footer-list__item">Кабинет покупателя</li>
          <li class="footer-list__item">Войти</li>
          <li class="footer-list__item">Создать учетную запись</li>
          <li class="footer-list__item">Заказы</li>
        </ul>
        <ul class="footer-list">
          <li class="footer-list__item">Магазин</li>
          <li class="footer-list__item">О компании</li>
          <li class="footer-list__item">Отзывы покупателей</li>
          <li class="footer-list__item">Бонусная система</li>
          <li class="footer-list__item">Промокоды</li>
          <li class="footer-list__item">Политика конфиденциальности</li>
        </ul>
        <ul class="footer-list">
          <li class="footer-list__item">Оформление заказа</li>
          <li class="footer-list__item">Доставка и оплата</li>
          <li class="footer-list__item">Возврат</li>
          <li class="footer-list__item">Пункты самовывоза</li>
        </ul>
        <ul class="footer-list">
          <li class="footer-list__item">Контакты</li>
          <li class="footer-list__item">727,г.Алматы</li>
          <li class="footer-list__item">ул.Саина Шаляпина</li>
          <li class="footer-list__item">д.22,кв.7</li>
          <li class="footer-list__item">8-777-575-90</li>
          <li class="footer-list__item">8-727-364-44-13</li>
          <li class="footer-list__item">Пн-Вс 9.00-20.00</li>
        </ul>
        <ul class="footer-list">
          <li class="footer-list__item">Мобильные приложения</li>
          <li class="footer-list__item">
            <img src="@images/icons/play-store.svg" alt="play store">
          </li>
          <li class="footer-list__item">
            <img src="@images/icons/app-store.svg" alt="app store">
          </li>
        </ul>
      </div>
      <br>
      <hr class="footer__line">
      <br>
    </div>
</template>

<script>
    export default {
    };
</script>

<style scoped>
  .footer {
    width: 1000px;
    margin: 140px auto 0 auto;
  }
  .footer__content {
    justify-content: space-between;
    display: flex;
  }
  .footer-list__item {
    text-align: left;
    font-size: 12px;
    line-height: 1.4em;
  }
  .footer-list:nth-child(4) .footer-list__item:nth-child(5),
  .footer-list:nth-child(4) .footer-list__item:nth-child(7),
  .footer-list:nth-child(5) .footer-list__item:nth-child(2),
  .footer-list:nth-child(5) .footer-list__item:nth-child(3) {
    margin-top: 8px;
  }
  .footer__line {
    display: block;
    opacity: 0.2;
    border: none;
    height: 1px;
    background-color: var(--primary-dark);
  }
</style>
