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

package org.apache.wiki.event;

/**
 *  WikiPageRenameEvent extends WikiPageEvent to indicate a change in the name of a WikiPage.
 *  <p>
 *  This reuses {@link #getPageName()} to return the new name of the page, with {@link #getOldPageName()} returning the old name.
 *
 * @see     org.apache.wiki.event.WikiPageEvent
 * @since   2.5.108
 */
public class WikiPageRenameEvent extends WikiPageEvent {

    private static final long serialVersionUID = 1L;

    /** Indicates a page rename event. This is based on events generated by {@link org.apache.wiki.content.PageRenamer}. */
    public static final int PAGE_RENAMED         = 28;

    private final String m_oldpagename;

    // ............

    /**
     *  Constructs an instance of this event.
     *
     * @param src    the Object that is the source of the event.
     * @param oldname   the old name of the WikiPage being acted upon.
     * @param newname   the new name of the WikiPage being acted upon.
     */
    public WikiPageRenameEvent( final Object src, final String oldname, final String newname ) {
        super( src, PAGE_RENAMED, newname );
        m_oldpagename = oldname;
    }

    /**
     * Returns the old Wiki page name associated with this event. This may be null if unavailable.
     *
     * @return     the old Wiki page name associated with this WikiEvent, or null.
     */
    public String getOldPageName() {
        return m_oldpagename;
    }

    /**
     * Returns the new Wiki page name associated with this event. This returns the same value as the superclass' {@link #getPageName()}.
     * This may be null if unavailable.
     *
     * @return     the new Wiki page name associated with this WikiEvent, or null.
     */
    public String getNewPageName() {
        return super.getPageName();
    }

    /**
     * Returns true if the int value is a WikiPageRenameEvent type.
     */
    public static boolean isValidType( final int type ) {
        return type == PAGE_RENAMED;
    }

    /**
     * Returns a textual representation of the event type.
     *
     * @return a String representation of the type
     */
    @Override
    public String eventName() {
        return "PAGE_RENAMED";
    //  switch ( getType() )
    //  {
    //      case PAGE_RENAMED:         return "PAGE_RENAMED";
    //      default:                   return super.eventName();
    //  }
    }


    /** Returns a human-readable description of the event type.
     * @return a String description of the type
     */
    @Override
    public String getTypeDescription() {
        return "page renamed event";
    //  switch ( getType() )
    //  {
    //      case PAGE_RENAMED:         return "page renamed event";
    //      default:                   return super.getTypeDescription();
    //  }
    }

}
