<template>
    <div class="container__menu">
      <app-menu></app-menu>
      <app-banner></app-banner>
      <app-popular-products-container></app-popular-products-container>
    </div>
</template>

<script>
  import AppMenu from "../components/AppMenu";
  import AppBanner from "../components/AppBanner";
  import AppPopularProductsContainer from "../components/AppPopularProductsContainer";

  export default {
    name: "main-page",
    components: {
        AppMenu,
        AppBanner,
        AppPopularProductsContainer
    }

  };
</script>

<style>
  .container__menu{
    width: 1000px;
    margin: 0 auto;
  }
</style>

