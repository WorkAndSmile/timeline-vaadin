
package org.mpilone.vaadin.timeline;

import java.util.Date;

import org.mpilone.vaadin.timeline.TimelineOptions.ItemType;


/**
 * A timeline item that defines the required properties for events on the
 * timeline.
 *
 * @author mpilone
 */
public interface TimelineItem {

  /**
   * Returns the unique ID of this item.
   *
   * @return the unique ID of the item
   */
  public Object getId();

  /**
   * Returns the ID of the group that the event belongs to. All events with the
   * same group ID will be displayed together on the timeline in a single group
   * row.
   *
   * @return the name of the group or null if not in a group
   */
  public String getGroupId();

  /**
   * Gets start date of event.
   *
   * @return Start date.
   */
  public Date getStart();

  /**
   * Get end date of event.
   *
   * @return End date;
   */
  public Date getEnd();

  /**
   * Gets content text of event.
   *
   * @return content text
   */
  public String getContent();

  /**
   * Returns the type of the item. The item type determines how the item will be
   * rendered on the timeline.
   *
   * @return the item type or null for the timeline default
   */
  public ItemType getType();

  /**
   * <p>
   * Gets style name of event. In the client, style name will be set to the
   * event's element class name and can be styled by CSS
   * </p>
   *
   * @return Style name.
   */
  public String getStyleName();
}