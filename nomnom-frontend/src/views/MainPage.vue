<template>
  <DefaultLayout>
    <div class="container__menu">
      <app-menu/>
      <app-banner/>
      <app-popular-products-container/>
    </div>
  </DefaultLayout>
</template>

<script>
import DefaultLayout from '../layouts/DefaultLayout';
import AppMenu from '../components/AppMenu';
import AppBanner from '../components/AppBanner';
import AppPopularProductsContainer from '../components/AppPopularProductsContainer';

export default {
  name: 'MainPage',
  components: {
    AppPopularProductsContainer,
    DefaultLayout,
    AppBanner,
    AppMenu
  }

};
</script>

<style>
  .container__menu{
    width: 1000px;
    margin: 0 auto;
  }
</style>

