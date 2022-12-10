/*
    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.
 */
package org.apache.wiki.htmltowiki.syntax.jspwiki;

import org.apache.wiki.htmltowiki.XHtmlElementToWikiTranslator;
import org.apache.wiki.htmltowiki.syntax.PlainTextCssSpecialDecorator;
import org.apache.wiki.htmltowiki.syntax.PlainTextMonospaceDecorator;

import java.io.PrintWriter;
import java.util.Deque;


/**
 * JSPWiki syntax implementation of {@link PlainTextMonospaceDecorator}.
 */
class JSPWikiPlainTextMonospaceDecorator extends PlainTextMonospaceDecorator {

    JSPWikiPlainTextMonospaceDecorator( final PlainTextCssSpecialDecorator ptcsd, final PrintWriter out, final Deque< String > preStack, final XHtmlElementToWikiTranslator chain ) {
        super( ptcsd, out, preStack, chain );
    }

    /** {@inheritDoc} */
    @Override
    protected String markupMonospaceOpen() {
        return "{{{";
    }

    /** {@inheritDoc} */
    @Override
    protected String markupMonospaceClose() {
        return "}}}";
    }

}