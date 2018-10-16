module.exports = {
  "plugins": [
    require('postcss-url'),
    require('postcss-import'),
    require('postcss-preset-env')({
      importFrom: 'static/css/variables.css',
      preserve: false,
      stage: 3,
      autoprefixer: true
    }),
  ]
};
