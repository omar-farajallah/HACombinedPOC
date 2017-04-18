var webpack = require('webpack');

module.exports = {
    entry: {
        // Our main app
        app: ['../HATraining/ui.apps/src/main/content/jcr_root/apps/biportal/components/react/App.js'],

        // React Habitat requires Object.assign pollyfill for old IE support
        vendor: ['babel-polyfill', 'react', 'react-dom', 'react-habitat']
    },
    output: {
        filename: '../HATraining/ui.apps/src/main/content/jcr_root/etc/designs/biportal/js/app-bundle.js'
    },
    resolve: {
        extensions: ['', '.js', '.jsx'],
    },
    module: {
        loaders:[
            {
                test: /\.jsx?$/, // Matches .js and .jsx files
                exclude:/node_modules/,
                loader: 'babel-loader',
                query: {
                    presets: ['es2015', 'react']
                }
            },
        ]
    },
    plugins: [

        // Split our app code and libraries. See "Entry" config above
        new webpack.optimize.CommonsChunkPlugin(/* chunkName= */"vendor", /* filename= */"../HATraining/ui.apps/src/main/content/jcr_root/etc/designs/biportal/js/vendor-bundle.js"),
    ]
};