package com.bcone.parsing;

public class ParsedExampleDataSet {
	private String extractedString = null;
	private int extractedInt = 0;
	private String id, name, address, phone, web, email, longitude, latitude,
			type, rate, details;

	public String getExtractedString() {
		return extractedString;
	}

	public void setExtractedString(String extractedString) {
		this.extractedString = extractedString;
	}

	public int getExtractedInt() {
		return extractedInt;
	}

	public void setExtractedInt(int extractedInt) {
		this.extractedInt = extractedInt;
	}

	public String toString() {

		// return "ExtractedString = " + this.extractedString;
		String cat = id + name + address + phone + web + email + longitude
				+ latitude + type + rate + details;
		return cat;

	}

	public void setId(String trim) {
		// TODO Auto-generated method stub
		id = trim;
	}

	public void setName(String trim) {
		// TODO Auto-generated method stub
		name = trim;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getWeb() {
		return web;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}


	//--------------------Playlist-----------------//

	private String 
				playlist_id,
				playlist_counter,
				playlist_name,
				playlist_layout_id,
				playlist_index,
				playlist_duration,
				playlist_per_hour_limit,
				playlist_per_day_limit, 
			    playlist_impression_limit,
			    playlist_create_date,
			    playlist_edit_date,
			    playlist_status;

	public void setPlaylist_id(String playlist_id) {
		this.playlist_id = playlist_id;
	}

	public String getPlaylist_id() {
		return playlist_id;
	}

	public void setPlaylist_name(String playlist_name) {
		this.playlist_name = playlist_name;
	}

	public String getPlaylist_name() {
		return playlist_name;
	}

	public void setPlaylist_layout_id(String playlist_layout_id) {
		this.playlist_layout_id = playlist_layout_id;
	}

	public String getPlaylist_layout_id() {
		return playlist_layout_id;
	}

	public void setPlaylist_index(String playlist_index) {
		this.playlist_index = playlist_index;
	}

	public String getPlaylist_index() {
		return playlist_index;
	}

	public void setPlaylist_duration(String playlist_duration) {
		this.playlist_duration = playlist_duration;
	}

	public String getPlaylist_duration() {
		return playlist_duration;
	}

	public void setPlaylist_per_hour_limit(String playlist_per_hour_limit) {
		this.playlist_per_hour_limit = playlist_per_hour_limit;
	}

	public String getPlaylist_per_hour_limit() {
		return playlist_per_hour_limit;
	}

	public void setPlaylist_per_day_limit(String playlist_per_day_limit) {
		this.playlist_per_day_limit = playlist_per_day_limit;
	}

	public String getPlaylist_per_day_limit() {
		return playlist_per_day_limit;
	}

	public void setPlaylist_impression_limit(String playlist_impression_limit) {
		this.playlist_impression_limit = playlist_impression_limit;
	}

	public String getPlaylist_impression_limit() {
		return playlist_impression_limit;
	}

	public void setPlaylist_create_date(String playlist_create_date) {
		this.playlist_create_date = playlist_create_date;
	}

	public String getPlaylist_create_date() {
		return playlist_create_date;
	}

	public void setPlaylist_edit_date(String playlist_edit_date) {
		this.playlist_edit_date = playlist_edit_date;
	}

	public String getPlaylist_edit_date() {
		return playlist_edit_date;
	}

	public void setPlaylist_status(String playlist_status) {
		this.playlist_status = playlist_status;
	}

	public String getPlaylist_status() {
		return playlist_status;
	}

	//---------------------Player variables------------------//
	private String player_imei, player_version, player_total_memory, player_available_memory, 
	player_total_hdd,player_available_hdd, player_internet, player_screen_size, 
	player_screen_resolution_x,player_screen_resolution_y,player_horizontal,player_vertical,player_ip,
	player_gps, player_ir_sensor, player_status,player_current_loc, player_operation_days,
	player_operation_hours, player_auto_shutdown, player_mode,player_server_address, 
	player_start_on_boot, player_restart_hour, player_start_logo;

	
	//Player Methods
	public void setPlayer_imei(String player_imei) {
		this.player_imei = player_imei;
	}

	public String getPlayer_imei() {
		return player_imei;
	}

	public void setPlayer_version(String player_version) {
		this.player_version = player_version;
	}

	public String getPlayer_version() {
		return player_version;
	}

	public void setPlayer_total_memory(String player_total_memory) {
		this.player_total_memory = player_total_memory;
	}

	public String getPlayer_total_memory() {
		return player_total_memory;
	}

	public void setPlayer_available_memory(String player_available_memory) {
		this.player_available_memory = player_available_memory;
	}

	public String getPlayer_available_memory() {
		return player_available_memory;
	}

	public void setPlayer_total_hdd(String player_total_hdd) {
		this.player_total_hdd = player_total_hdd;
	}

	public String getPlayer_total_hdd() {
		return player_total_hdd;
	}

	public void setPlayer_screen_resolution_x(String player_screen_resolution_x) {
		this.player_screen_resolution_x = player_screen_resolution_x;
	}

	public String getPlayer_screen_resolution_x() {
		return player_screen_resolution_x;
	}

	public void setPlayer_available_hdd(String player_available_hdd) {
		this.player_available_hdd = player_available_hdd;
	}

	public String getPlayer_available_hdd() {
		return player_available_hdd;
	}

	public void setPlayer_internet(String player_internet) {
		this.player_internet = player_internet;
	}

	public String getPlayer_internet() {
		return player_internet;
	}

	public void setPlayer_screen_size(String player_screen_size) {
		this.player_screen_size = player_screen_size;
	}

	public String getPlayer_screen_size() {
		return player_screen_size;
	}

	

	public void setPlayer_screen_resolution_y(String player_screen_resolution_y) {
		this.player_screen_resolution_y = player_screen_resolution_y;
	}

	public String getPlayer_screen_resolution_y() {
		return player_screen_resolution_y;
	}

	public void setPlayer_horizontal(String player_horizontal) {
		this.player_horizontal = player_horizontal;
	}

	public String getPlayer_horizontal() {
		return player_horizontal;
	}

	public void setPlayer_vertical(String player_vertical) {
		this.player_vertical = player_vertical;
	}

	public String getPlayer_vertical() {
		return player_vertical;
	}

	public void setPlayer_ip(String player_ip) {
		this.player_ip = player_ip;
	}

	public String getPlayer_ip() {
		return player_ip;
	}

	public void setPlayer_gps(String player_gps) {
		this.player_gps = player_gps;
	}

	public String getPlayer_gps() {
		return player_gps;
	}

	public void setPlayer_ir_sensor(String player_ir_sensor) {
		this.player_ir_sensor = player_ir_sensor;
	}

	public String getPlayer_ir_sensor() {
		return player_ir_sensor;
	}

	public void setPlayer_status(String player_status) {
		this.player_status = player_status;
	}

	public String getPlayer_status() {
		return player_status;
	}

	public void setPlayer_current_loc(String player_current_loc) {
		this.player_current_loc = player_current_loc;
	}

	public String getPlayer_current_loc() {
		return player_current_loc;
	}

	public void setPlayer_operation_days(String player_operation_days) {
		this.player_operation_days = player_operation_days;
	}

	public String getPlayer_operation_days() {
		return player_operation_days;
	}

	public void setPlayer_operation_hours(String player_operation_hours) {
		this.player_operation_hours = player_operation_hours;
	}

	public String getPlayer_operation_hours() {
		return player_operation_hours;
	}

	public void setPlayer_auto_shutdown(String player_auto_shutdown) {
		this.player_auto_shutdown = player_auto_shutdown;
	}

	public String getPlayer_auto_shutdown() {
		return player_auto_shutdown;
	}

	public void setPlayer_mode(String player_mode) {
		this.player_mode = player_mode;
	}

	public String getPlayer_mode() {
		return player_mode;
	}

	public void setPlayer_server_address(String player_server_address) {
		this.player_server_address = player_server_address;
	}

	public String getPlayer_server_address() {
		return player_server_address;
	}

	public void setPlayer_start_on_boot(String player_start_on_boot) {
		this.player_start_on_boot = player_start_on_boot;
	}

	public String getPlayer_start_on_boot() {
		return player_start_on_boot;
	}

	public void setPlayer_restart_hour(String player_restart_hour) {
		this.player_restart_hour = player_restart_hour;
	}

	public String getPlayer_restart_hour() {
		return player_restart_hour;
	}

	public void setPlayer_start_logo(String player_start_logo) {
		this.player_start_logo = player_start_logo;
	}

	public String getPlayer_start_logo() {
		return player_start_logo;
	}
	
	//--------------------Layout------------------//


	private String 
				layout_id,
				layout_playlist_id,
				layout_counter,
				layout_display_resolution_x,
				layout_display_resolution_y,
				layout_mode,
				layout_horizontal_ratio,
				layout_vertical_ratio,
				layout_no_of_zone,
				layout_create_date,
				layout_edit_date;
	

	
	public void setLayout_id(String layout_id) {
		this.layout_id = layout_id;
	}

	public String getLayout_id() {
		return layout_id;
	}

	public void setLayout_display_resolution_x(
			String layout_display_resolution_x) {
		this.layout_display_resolution_x = layout_display_resolution_x;
	}

	public String getLayout_display_resolution_x() {
		return layout_display_resolution_x;
	}

	public void setLayout_display_resolution_y(
			String layout_display_resolution_y) {
		this.layout_display_resolution_y = layout_display_resolution_y;
	}

	public String getLayout_display_resolution_y() {
		return layout_display_resolution_y;
	}

	public void setLayout_mode(String layout_mode) {
		this.layout_mode = layout_mode;
	}

	public String getLayout_mode() {
		return layout_mode;
	}

	public void setLayout_horizontal_ratio(String layout_horizontal_ratio) {
		this.layout_horizontal_ratio = layout_horizontal_ratio;
	}

	public String getLayout_horizontal_ratio() {
		return layout_horizontal_ratio;
	}

	public void setLayout_vertical_ratio(String layout_vertical_ratio) {
		this.layout_vertical_ratio = layout_vertical_ratio;
	}

	public String getLayout_vertical_ratio() {
		return layout_vertical_ratio;
	}

	public void setLayout_no_of_zone(String layout_no_of_zone) {
		this.layout_no_of_zone = layout_no_of_zone;
	}

	public String getLayout_no_of_zone() {
		return layout_no_of_zone;
	}

	public void setLayout_create_date(String layout_create_date) {
		this.layout_create_date = layout_create_date;
	}

	public String getLayout_create_date() {
		return layout_create_date;
	}

	public void setLayout_edit_date(String layout_edit_date) {
		this.layout_edit_date = layout_edit_date;
	}

	public String getLayout_edit_date() {
		return layout_edit_date;
	}

	//-----------------Zone-----------------------//
	
	private String  layout_zone_id,
	zone_id,
	zone_x,
	zone_y,
	zone_width,
	zone_height,
	zone_background_color;
	
	public void setLayout_zone_id(String layout_zone_id) {
		this.layout_zone_id = layout_zone_id;
	}

	public String getLayout_zone_id() {
		return layout_zone_id;
	}
	
	public void setZone_x(String zone_x) {
		this.zone_x = zone_x;
	}

	public String getZone_x() {
		return zone_x;
	}

	public void setZone_y(String zone_y) {
		this.zone_y = zone_y;
	}

	public String getZone_y() {
		return zone_y;
	}

	public void setZone_width(String zone_width) {
		this.zone_width = zone_width;
	}

	public String getZone_width() {
		return zone_width;
	}

	public void setZone_height(String zone_height) {
		this.zone_height = zone_height;
	}

	public String getZone_height() {
		return zone_height;
	}

	public void setZone_background_color(String zone_background_color) {
		this.zone_background_color = zone_background_color;
	}

	public String getZone_background_color() {
		return zone_background_color;
	}


	
	//---------------Media-------------------// 


	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}

	public String getZone_id() {
		return zone_id;
	}


	private String 
				media_id,
				media_playlist_id,
				media_layout_id,
				media_zone_id,
				media_format,
				media_size_x,
				media_size_y,
				media_attributes,
				media_location,
				media_full_screen_mode,
				media_size_mode,
				media_per_hour_limit,
				media_per_day_limit,
				media_impression_limit,
				media_create_date,
				media_edit_date,
				media_status,
				media_length,
				media_volume,
				media_extension,
				media_start_date,
				media_end_date,
				media_start_time,
				media_end_time;
	

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_zone_id(String media_zone_id) {
		this.media_zone_id = media_zone_id;
	}

	public String getMedia_zone_id() {
		return media_zone_id;
	}

	public void setMedia_format(String media_format) {
		this.media_format = media_format;
	}

	public String getMedia_format() {
		return media_format;
	}

	public void setMedia_size_x(String media_size_x) {
		this.media_size_x = media_size_x;
	}

	public String getMedia_size_x() {
		return media_size_x;
	}

	public void setMedia_size_y(String media_size_y) {
		this.media_size_y = media_size_y;
	}

	public String getMedia_size_y() {
		return media_size_y;
	}

	public void setMedia_attributes(String media_attributes) {
		this.media_attributes = media_attributes;
	}

	public String getMedia_attributes() {
		return media_attributes;
	}

	public void setMedia_location(String media_location) {
		this.media_location = media_location;
	}

	public String getMedia_location() {
		return media_location;
	}

	public void setMedia_full_screen_mode(String media_full_screen_mode) {
		this.media_full_screen_mode = media_full_screen_mode;
	}

	public String getMedia_full_screen_mode() {
		return media_full_screen_mode;
	}

	public void setMedia_size_mode(String media_size_mode) {
		this.media_size_mode = media_size_mode;
	}

	public String getMedia_size_mode() {
		return media_size_mode;
	}

	public void setMedia_per_hour_limit(String media_per_hour_limit) {
		this.media_per_hour_limit = media_per_hour_limit;
	}

	public String getMedia_per_hour_limit() {
		return media_per_hour_limit;
	}

	public void setMedia_per_day_limit(String media_per_day_limit) {
		this.media_per_day_limit = media_per_day_limit;
	}

	public String getMedia_per_day_limit() {
		return media_per_day_limit;
	}

	public void setMedia_impression_limit(String media_impression_limit) {
		this.media_impression_limit = media_impression_limit;
	}

	public String getMedia_impression_limit() {
		return media_impression_limit;
	}

	public void setMedia_create_date(String media_create_date) {
		this.media_create_date = media_create_date;
	}

	public String getMedia_create_date() {
		return media_create_date;
	}

	public void setMedia_edit_date(String media_edit_date) {
		this.media_edit_date = media_edit_date;
	}

	public String getMedia_edit_date() {
		return media_edit_date;
	}

	public void setMedia_status(String media_status) {
		this.media_status = media_status;
	}

	public String getMedia_status() {
		return media_status;
	}

	public void setMedia_length(String media_length) {
		this.media_length = media_length;
	}

	public String getMedia_length() {
		return media_length;
	}

	public void setMedia_volume(String media_volume) {
		this.media_volume = media_volume;
	}

	public String getMedia_volume() {
		return media_volume;
	}



	


	//-----------Scheduler-------------//
	
	private String scheduler_id,scheduler_playlist_id,scheduler_playlist_index,scheduler_valid_from,
	scheduler_start_date,scheduler_end_date,scheduler_start_time,scheduler_end_time,scheduler_days,
	scheduler_total_duration,scheduler_create_date,scheduler_edit_date,scheduler_status;
	
	public void setScheduler_id(String scheduler_id) {
		this.scheduler_id = scheduler_id;
	}

	public String getScheduler_id() {
		return scheduler_id;
	}

	public void setScheduler_playlist_id(String scheduler_playlist_id) {
		this.scheduler_playlist_id = scheduler_playlist_id;
	}

	public String getScheduler_playlist_id() {
		return scheduler_playlist_id;
	}

	public void setScheduler_playlist_index(String scheduler_playlist_index) {
		this.scheduler_playlist_index = scheduler_playlist_index;
	}

	public String getScheduler_playlist_index() {
		return scheduler_playlist_index;
	}

	public void setScheduler_valid_from(String scheduler_valid_from) {
		this.scheduler_valid_from = scheduler_valid_from;
	}

	public String getScheduler_valid_from() {
		return scheduler_valid_from;
	}

	public void setScheduler_start_date(String scheduler_start_date) {
		this.scheduler_start_date = scheduler_start_date;
	}

	public String getScheduler_start_date() {
		return scheduler_start_date;
	}

	public void setScheduler_end_date(String scheduler_end_date) {
		this.scheduler_end_date = scheduler_end_date;
	}

	public String getScheduler_end_date() {
		return scheduler_end_date;
	}

	public void setScheduler_start_time(String scheduler_start_time) {
		this.scheduler_start_time = scheduler_start_time;
	}

	public String getScheduler_start_time() {
		return scheduler_start_time;
	}

	public void setScheduler_end_time(String scheduler_end_time) {
		this.scheduler_end_time = scheduler_end_time;
	}

	public String getScheduler_end_time() {
		return scheduler_end_time;
	}

	public void setScheduler_days(String scheduler_days) {
		this.scheduler_days = scheduler_days;
	}

	public String getScheduler_days() {
		return scheduler_days;
	}

	public void setScheduler_total_duration(String scheduler_total_duration) {
		this.scheduler_total_duration = scheduler_total_duration;
	}

	public String getScheduler_total_duration() {
		return scheduler_total_duration;
	}

	public void setScheduler_create_date(String scheduler_create_date) {
		this.scheduler_create_date = scheduler_create_date;
	}

	public String getScheduler_create_date() {
		return scheduler_create_date;
	}

	public void setScheduler_edit_date(String scheduler_edit_date) {
		this.scheduler_edit_date = scheduler_edit_date;
	}

	public String getScheduler_edit_date() {
		return scheduler_edit_date;
	}

	public void setScheduler_status(String scheduler_status) {
		this.scheduler_status = scheduler_status;
	}

	public String getScheduler_status() {
		return scheduler_status;
	}


	//-----------PlayLog---------------//
	
	private String playlog_player_id,playlog_date,playlog_time,playlog_location,playlog_schedule_id,
	playlog_playlist_id,playlog_total_impression,playlog_media_image,playlog_media_video,
	playlog_media_html,playlog_trigger_id;
	
	

	public void setPlaylog_player_id(String playlog_player_id) {
		this.playlog_player_id = playlog_player_id;
	}

	public String getPlaylog_player_id() {
		return playlog_player_id;
	}

	public void setPlaylog_date(String playlog_date) {
		this.playlog_date = playlog_date;
	}

	public String getPlaylog_date() {
		return playlog_date;
	}

	public void setPlaylog_time(String playlog_time) {
		this.playlog_time = playlog_time;
	}

	public String getPlaylog_time() {
		return playlog_time;
	}

	public void setPlaylog_location(String playlog_location) {
		this.playlog_location = playlog_location;
	}

	public String getPlaylog_location() {
		return playlog_location;
	}

	public void setPlaylog_schedule_id(String playlog_schedule_id) {
		this.playlog_schedule_id = playlog_schedule_id;
	}

	public String getPlaylog_schedule_id() {
		return playlog_schedule_id;
	}

	public void setPlaylog_playlist_id(String playlog_playlist_id) {
		this.playlog_playlist_id = playlog_playlist_id;
	}

	public String getPlaylog_playlist_id() {
		return playlog_playlist_id;
	}

	public void setPlaylog_total_impression(String playlog_total_impression) {
		this.playlog_total_impression = playlog_total_impression;
	}

	public String getPlaylog_total_impression() {
		return playlog_total_impression;
	}

	public void setPlaylog_media_image(String playlog_media_image) {
		this.playlog_media_image = playlog_media_image;
	}

	public String getPlaylog_media_image() {
		return playlog_media_image;
	}

	public void setPlaylog_media_video(String playlog_media_video) {
		this.playlog_media_video = playlog_media_video;
	}

	public String getPlaylog_media_video() {
		return playlog_media_video;
	}

	public void setPlaylog_media_html(String playlog_media_html) {
		this.playlog_media_html = playlog_media_html;
	}

	public String getPlaylog_media_html() {
		return playlog_media_html;
	}

	public void setPlaylog_trigger_id(String playlog_trigger_id) {
		this.playlog_trigger_id = playlog_trigger_id;
	}

	public String getPlaylog_trigger_id() {
		return playlog_trigger_id;
	}


	//-------------Trigger---------------//


	private String trigger_id,trigger_type,trigger_value,trigger_playlist_id,trigger_zone_id,
	trigger_media_id,trigger_validity,trigger_create_date,trigger_valid_upto,trigger_status,trigger_index;

	
	public void setTrigger_id(String trigger_id) {
		this.trigger_id = trigger_id;
	}

	public String getTrigger_id() {
		return trigger_id;
	}

	public void setTrigger_type(String trigger_type) {
		this.trigger_type = trigger_type;
	}

	public String getTrigger_type() {
		return trigger_type;
	}

	public void setTrigger_value(String trigger_value) {
		this.trigger_value = trigger_value;
	}

	public String getTrigger_value() {
		return trigger_value;
	}

	public void setTrigger_playlist_id(String trigger_playlist_id) {
		this.trigger_playlist_id = trigger_playlist_id;
	}

	public String getTrigger_playlist_id() {
		return trigger_playlist_id;
	}

	public void setTrigger_zone_id(String trigger_zone_id) {
		this.trigger_zone_id = trigger_zone_id;
	}

	public String getTrigger_zone_id() {
		return trigger_zone_id;
	}

	public void setTrigger_media_id(String trigger_media_id) {
		this.trigger_media_id = trigger_media_id;
	}

	public String getTrigger_media_id() {
		return trigger_media_id;
	}

	public void setTrigger_validity(String trigger_validity) {
		this.trigger_validity = trigger_validity;
	}

	public String getTrigger_validity() {
		return trigger_validity;
	}

	public void setTrigger_create_date(String trigger_create_date) {
		this.trigger_create_date = trigger_create_date;
	}

	public String getTrigger_create_date() {
		return trigger_create_date;
	}

	public void setTrigger_valid_upto(String trigger_valid_upto) {
		this.trigger_valid_upto = trigger_valid_upto;
	}

	public String getTrigger_valid_upto() {
		return trigger_valid_upto;
	}

	public void setTrigger_status(String trigger_status) {
		this.trigger_status = trigger_status;
	}

	public String getTrigger_status() {
		return trigger_status;
	}

	public void setTrigger_index(String trigger_index) {
		this.trigger_index = trigger_index;
	}

	public String getTrigger_index() {
		return trigger_index;
	}

	public void setLayout_playlist_id(String layout_playlist_id) {
		this.layout_playlist_id = layout_playlist_id;
	}

	public String getLayout_playlist_id() {
		return layout_playlist_id;
	}

	public void setLayout_counter(String layout_counter) {
		this.layout_counter = layout_counter;
	}

	public String getLayout_counter() {
		return layout_counter;
	}

	public void setMedia_playlist_id(String media_playlist_id) {
		this.media_playlist_id = media_playlist_id;
	}

	public String getMedia_playlist_id() {
		return media_playlist_id;
	}

	public void setMedia_layout_id(String media_layout_id) {
		this.media_layout_id = media_layout_id;
	}

	public String getMedia_layout_id() {
		return media_layout_id;
	}

	public void setPlaylist_counter(String playlist_counter) {
		this.playlist_counter = playlist_counter;
	}

	public String getPlaylist_counter() {
		return playlist_counter;
	}

	public void setMedia_extension(String media_extension) {
		this.media_extension = media_extension;
	}

	public String getMedia_extension() {
		return media_extension;
	}

	public void setMedia_start_date(String media_start_date) {
		this.media_start_date = media_start_date;
	}

	public String getMedia_start_date() {
		return media_start_date;
	}

	public void setMedia_end_date(String media_end_date) {
		this.media_end_date = media_end_date;
	}

	public String getMedia_end_date() {
		return media_end_date;
	}

	public void setMedia_start_time(String media_start_time) {
		this.media_start_time = media_start_time;
	}

	public String getMedia_start_time() {
		return media_start_time;
	}

	public void setMedia_end_time(String media_end_time) {
		this.media_end_time = media_end_time;
	}

	public String getMedia_end_time() {
		return media_end_time;
	}

	

	
	
	
	

	
}