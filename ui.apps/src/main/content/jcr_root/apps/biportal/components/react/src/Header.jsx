import React, { Component } from 'react';

class Header extends Component {
  
  
  render() {
    return (
	      <a href={this.props.logoURL}>{this.props.logoLabel}</a>
    );
  }
}

export default Header;