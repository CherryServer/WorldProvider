package delta.cion.cherry.worldprovider;

import delta.cion.cherry.api.plugin.Plugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldProvider extends Plugin {

	private static final Logger LOGGER = LoggerFactory.getLogger(WorldProvider.class);

	private static Plugin instance;

	public static Plugin getInstance() {
		return instance;
	}

	public WorldProvider(String id, String name, String version) {
		super(id, name, version);
	}

	@Override
	public void onEnable() {
		instance = this;
	}

	@Override
	public void onDisable() {}
}
