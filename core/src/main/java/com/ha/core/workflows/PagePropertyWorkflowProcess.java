package com.ha.core.workflows;

import javax.jcr.Node;
import javax.jcr.Session;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.exec.WorkflowProcess;
import com.adobe.granite.workflow.metadata.MetaDataMap;


@Component
@Service
@Properties({
		@Property(name = "process.label", value = "Holland Page Property Addition"),
		@Property(name = "process.description", value = "Adds a property to a newly created page")
})
public class PagePropertyWorkflowProcess implements WorkflowProcess {

	@Override
	public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
		Session session = workflowSession.adaptTo(Session.class);
		WorkflowData data = workItem.getWorkflowData();
		String path = null;
		String type = data.getPayloadType();
		try {
			if (type.equals("JCR_PATH") && data.getPayload() != null) {
				String payloadData = (String) data.getPayload();
				if (session.itemExists(payloadData)) {
					path = payloadData;
				}
			}
			if (path != null) {
				Node payloadNode = (Node) session.getItem(path);
				payloadNode.setProperty("workflow", "Created");
				session.save();
			}
		} catch (Exception e) {
			
		}
	}	
}