webpackJsonp([0],{

/***/ 0:
/***/ function(module, exports, __webpack_require__) {

	module.exports = __webpack_require__(1);


/***/ },

/***/ 1:
/***/ function(module, exports, __webpack_require__) {

	'use strict';

	Object.defineProperty(exports, "__esModule", {
	  value: true
	});

	var _reactHabitat = __webpack_require__(2);

	var _reactHabitat2 = _interopRequireDefault(_reactHabitat);

	var _SomeReactComponent = __webpack_require__(186);

	var _SomeReactComponent2 = _interopRequireDefault(_SomeReactComponent);

	function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

	function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

	function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

	function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

	// Our top level react components


	var Main = function (_ReactHabitat$Bootstr) {
	  _inherits(Main, _ReactHabitat$Bootstr);

	  function Main() {
	    _classCallCheck(this, Main);

	    // Create a new container
	    var _this = _possibleConstructorReturn(this, (Main.__proto__ || Object.getPrototypeOf(Main)).call(this));

	    var container = new _reactHabitat2.default.Container();

	    // Register our components that we want to expose to the DOM
	    container.register('SomeReactComponent', _SomeReactComponent2.default);

	    // Set the DOM container
	    _this.setContainer(container);

	    return _this;
	  }

	  return Main;
	}(_reactHabitat2.default.Bootstrapper);

	exports.default = new Main();

/***/ },

/***/ 186:
/***/ function(module, exports, __webpack_require__) {

	'use strict';

	Object.defineProperty(exports, "__esModule", {
	  value: true
	});

	var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

	var _react = __webpack_require__(187);

	var _react2 = _interopRequireDefault(_react);

	function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

	function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

	function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

	function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

	var SomeReactComponent = function (_Component) {
	  _inherits(SomeReactComponent, _Component);

	  function SomeReactComponent() {
	    _classCallCheck(this, SomeReactComponent);

	    return _possibleConstructorReturn(this, (SomeReactComponent.__proto__ || Object.getPrototypeOf(SomeReactComponent)).apply(this, arguments));
	  }

	  _createClass(SomeReactComponent, [{
	    key: 'render',
	    value: function render() {
	      return _react2.default.createElement(
	        'div',
	        null,
	        _react2.default.createElement(
	          'h1',
	          null,
	          this.props.title
	        ),
	        _react2.default.createElement(
	          'h1',
	          null,
	          this.props.color
	        )
	      );
	    }
	  }]);

	  return SomeReactComponent;
	}(_react.Component);

	exports.default = SomeReactComponent;

/***/ }

});