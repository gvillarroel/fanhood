package com.fanhood.presentation.main

import org.scalatra._
import scalate.ScalateSupport

class Fanhood extends FanhoodUtilsStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
