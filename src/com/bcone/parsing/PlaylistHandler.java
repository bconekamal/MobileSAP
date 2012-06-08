package com.bcone.parsing;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PlaylistHandler extends DefaultHandler {

	// ===========================================================
	// Fields
	// ===========================================================

	private boolean in_outertag = false;
	private boolean in_innertag = false;
	private boolean in_mytag = false;

	private StringBuilder mStringBuilder = new StringBuilder();
	private List<ParsedExampleDataSet> mParsedDataSetList = new ArrayList<ParsedExampleDataSet>();

	private ParsedExampleDataSet mParsedExampleDataSet = new ParsedExampleDataSet();

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public List<ParsedExampleDataSet> getParsedData() {
		return this.mParsedDataSetList;
	}

	// ===========================================================
	// Methods
	// ===========================================================
	@Override
	public void startDocument() throws SAXException {
		System.out.println("@@@@ createeeeeeeeeeeeeeeeeeee");
		this.mParsedExampleDataSet = new ParsedExampleDataSet();
	}

	@Override
	public void endDocument() throws SAXException {
		// Nothing to do
	}

	/**
	 * Gets be called on opening tags like: <tag> Can provide attribute(s), when
	 * xml was like: <tag attribute="attributeValue">
	 */
	@Override
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes atts) throws SAXException {
	}

	public static int counter = 0;

	public static int getCounter() {
		System.out.println("Counter ====== " + counter);
		return counter;
	}

	/**
	 * Gets be called on closing tags like: </tag>
	 */
	@Override
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException {

		if (localName.equals("playlist")) {
			mParsedExampleDataSet = null;
			startDocument();
			counter++;
		}
		// if (localName.equals("counter")) {
		// counter = Integer.parseInt(mStringBuilder.toString().trim());
		// System.out.println("###### Playlist Counter = "+counter);
		//
		// }
		else if (localName.equals("playlist_id")) {
			mParsedExampleDataSet.setPlaylist_id(mStringBuilder.toString()
					.trim());
			System.out.println("###### Playlist ID = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_name")) {
			mParsedExampleDataSet.setPlaylist_name(mStringBuilder.toString()
					.trim());
			System.out.println("###### Playlist Name = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_layout_id")) {
			mParsedExampleDataSet.setPlaylist_layout_id(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Layout ID = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_index")) {
			mParsedExampleDataSet.setPlaylist_index(mStringBuilder.toString()
					.trim());
			System.out.println("###### Playlist Index = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_duration")) {
			mParsedExampleDataSet.setPlaylist_duration(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Duration = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_per_hour_limit")) {
			mParsedExampleDataSet.setPlaylist_per_hour_limit(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Per Hour Limit = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_per_day_limit")) {
			mParsedExampleDataSet.setPlaylist_per_day_limit(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Per Day Limit = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_impression_limit")) {
			mParsedExampleDataSet.setPlaylist_impression_limit(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Impression Limit = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_create_date")) {
			mParsedExampleDataSet.setPlaylist_create_date(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Create Date = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_edit_date")) {
			mParsedExampleDataSet.setPlaylist_edit_date(mStringBuilder
					.toString().trim());
			System.out.println("###### Playlist Edit Date = "
					+ mStringBuilder.toString().trim());

		} else if (localName.equals("playlist_status")) {
			mParsedExampleDataSet.setPlaylist_status(mStringBuilder.toString()
					.trim());

			this.mParsedDataSetList.add(mParsedExampleDataSet);

			System.out
					.println("addddddddddddddddddddddddddddddddddddd     ###### Playlist Status = "
							+ mStringBuilder.toString().trim());
		}

		mStringBuilder.setLength(0);

	}

	/**
	 * Gets be called on the following structure: <tag>characters</tag>
	 */
	@Override
	public void characters(char ch[], int start, int length) {
		mStringBuilder.append(ch, start, length);
	}

}
