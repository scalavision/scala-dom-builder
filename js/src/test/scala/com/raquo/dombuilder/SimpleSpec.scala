package com.raquo.dombuilder

import com.raquo.dombuilder.generic.nodes.Node
import com.raquo.domtestutils.EventSimulator
import com.raquo.domtestutils.matching.RuleImplicits
import com.raquo.domtestutils.scalatest.MountSpec
import org.scalajs.dom

trait SimpleSpec
  extends MountSpec
  with RuleImplicits
  with EventSimulator
{

  def mount(node: Node[_, dom.Node, dom.Node], clue: String = defaultMountedElementClue): Unit = {
    mount(node.ref, clue)
  }

  def mount(clue: String, node: Node[_, dom.Node, dom.Node]): Unit = {
    mount(node.ref, clue)
  }
}
