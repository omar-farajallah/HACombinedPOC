import React, { Component } from 'react';

class SomeReactComponent extends Component {
  render() {
    return (
      <div>
        <h1>{this.props.title}</h1>
        <h1>{this.props.color}</h1>
      </div>
    );
  }
}

export default SomeReactComponent;