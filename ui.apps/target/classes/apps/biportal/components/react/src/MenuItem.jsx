import React, { Component } from 'react';

class MenuItem extends Component {    
  
  getLinks() {
    var links = [];
    $.ajax({
      url: "etc/designs/biportal/react-json.json",
      async: false,
      success: function(data) {
        var linkData = data.links;
        for (var i = 0; i < linkData.length; i++) {
          links.push(<a href={linkData[i].linkUrl}>{linkData[i].linkLabel}</a>);
        }
      }
    });
    
    return links;
    
  }
	
  render() { 	
    return (
		<div>
		    <div>{this.props.sectionLabel}</div>
		    <ul>
		      {this.getLinks()}
		    </ul>
		  </div>
    );
  }
}

export default MenuItem;