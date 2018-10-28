<template>
  <DefaultLayout>
    <div class="container__menu">
      <app-banner/>
      <app-popular-products-container/>
    </div>
  </DefaultLayout>
</template>

<script>
import DefaultLayout from '../layouts/DefaultLayout';
import AppBanner from '../components/AppBanner';
import AppPopularProductsContainer from '../components/AppPopularProductsContainer';

export default {
  name: 'MainPage',
  components: {
    AppPopularProductsContainer,
    DefaultLayout,
    AppBanner
  }

};
</script>

<style>

</style>

