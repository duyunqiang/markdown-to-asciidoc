/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.joshlong.markup.asciidoc;

import org.pegdown.ast.*;

/**
 * Just.. WUT?? so many callbacks... Don't want them polluting an implementation class because it'll take ages to
 * navigate around. On the other hand this is basically the "to do" list for the converter...
 * <p/>
 * TODO support bullets (correctly, as opposed to accidentally) TODO support blockquotes, definitions, etc.
 */
public class SimpleVisitorAdapter implements Visitor {
	@Override
	public void visit(AbbreviationNode node) {

	}

	@Override
	public void visit(AutoLinkNode node) {

	}

	@Override
	public void visit(BlockQuoteNode node) {

	}

	@Override
	public void visit(BulletListNode node) {

	}

	@Override
	public void visit(CodeNode node) {

	}

	@Override
	public void visit(DefinitionListNode node) {

	}

	@Override
	public void visit(DefinitionNode node) {

	}

	@Override
	public void visit(DefinitionTermNode node) {

	}

	@Override
	public void visit(ExpImageNode node) {

	}

	@Override
	public void visit(ExpLinkNode node) {

	}

	@Override
	public void visit(HeaderNode node) {

	}

	@Override
	public void visit(HtmlBlockNode node) {

	}

	@Override
	public void visit(InlineHtmlNode node) {

	}

	@Override
	public void visit(ListItemNode node) {

	}

	@Override
	public void visit(MailLinkNode node) {

	}

	@Override
	public void visit(OrderedListNode node) {

	}

	@Override
	public void visit(ParaNode node) {

	}

	@Override
	public void visit(QuotedNode node) {

	}

	@Override
	public void visit(ReferenceNode node) {

	}

	@Override
	public void visit(RefImageNode node) {

	}

	@Override
	public void visit(RefLinkNode node) {

	}

	@Override
	public void visit(RootNode node) {

	}

	@Override
	public void visit(SimpleNode node) {

	}

	@Override
	public void visit(SpecialTextNode node) {

	}

	@Override
	public void visit(StrongEmphSuperNode node) {

	}

	@Override
	public void visit(TableBodyNode node) {

	}

	@Override
	public void visit(TableCaptionNode node) {

	}

	@Override
	public void visit(TableCellNode node) {

	}

	@Override
	public void visit(TableColumnNode node) {

	}

	@Override
	public void visit(TableHeaderNode node) {

	}

	@Override
	public void visit(TableNode node) {

	}

	@Override
	public void visit(TableRowNode node) {

	}

	@Override
	public void visit(VerbatimNode node) {

	}

	@Override
	public void visit(WikiLinkNode node) {

	}

	@Override
	public void visit(TextNode node) {

	}

	@Override
	public void visit(SuperNode node) {

	}

	@Override
	public void visit(Node node) {

	}
}