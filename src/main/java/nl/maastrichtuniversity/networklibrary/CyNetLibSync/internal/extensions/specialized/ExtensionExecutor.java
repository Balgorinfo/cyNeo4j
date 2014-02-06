package nl.maastrichtuniversity.networklibrary.CyNetLibSync.internal.extensions.specialized;

import java.util.List;

import nl.maastrichtuniversity.networklibrary.CyNetLibSync.internal.Plugin;
import nl.maastrichtuniversity.networklibrary.CyNetLibSync.internal.extensions.Extension;
import nl.maastrichtuniversity.networklibrary.CyNetLibSync.internal.utils.Neo4jCall;

public interface ExtensionExecutor {
	
	boolean collectParameters();

	void processCallResponse(Neo4jCall call, Object callRetValue);

	void setPlugin(Plugin plugin);
	void setExtension(Extension extension);

	List<Neo4jCall> buildNeo4jCalls(String instanceLocation);

}
