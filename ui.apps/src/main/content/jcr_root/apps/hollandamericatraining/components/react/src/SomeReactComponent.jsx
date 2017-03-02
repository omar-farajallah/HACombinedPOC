import React, { Component } from 'react';

class SomeReactComponent extends Component {
  render() {
    return (
		<h2>This is the React Component: {this.props.title}</h2>
    );
  }
}

export default SomeReactComponent;