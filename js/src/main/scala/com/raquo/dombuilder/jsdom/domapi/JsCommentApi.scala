package com.raquo.dombuilder.jsdom.domapi

import com.raquo.dombuilder.generic.domapi.CommentApi
import org.scalajs.dom

trait JsCommentApi[N] extends CommentApi[N, dom.Comment, dom.Node] {

  override def createNode(text: String): dom.Comment = dom.document.createComment(text)

  override def setText(node: CommentNode, text: String): Unit = {
    node.ref.textContent = text
  }
}
