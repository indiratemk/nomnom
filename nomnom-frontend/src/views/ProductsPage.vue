<template>
  <DefaultLayout>
    <general-products-container />
  </DefaultLayout>
</template>

<script>
import DefaultLayout from '../layouts/DefaultLayout';
import GeneralProductsContainer from '../components/GeneralProductsContainer';

export default {
  name: 'TestPage',
  components: {
    DefaultLayout,
    GeneralProductsContainer
  }
};
</script>

<style scoped>

</style>
