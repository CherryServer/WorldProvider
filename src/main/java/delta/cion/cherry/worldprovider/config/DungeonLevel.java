package delta.cion.cherry.worldprovider.config;

import delta.cion.cherry.worldprovider.room.RoomRandomizer;

public interface DungeonLevel {

	String name();
	long level();

	RoomRandomizer ROOM_RANDOMIZER();

}
