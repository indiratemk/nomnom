<template>
  <DefaultLayout>
    <general-product />
  </DefaultLayout>
</template>

<script>
import DefaultLayout from '../layouts/DefaultLayout';
import GeneralProduct from '../components/GeneralProduct';

export default {
  name: 'TestPage',
  components: {
    DefaultLayout,
    GeneralProduct
  }
};
</script>

<style scoped>

</style>
