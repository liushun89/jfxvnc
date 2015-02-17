package org.jfxvnc.net.rfb;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import org.jfxvnc.net.rfb.codec.ProtocolVersion;
import org.jfxvnc.net.rfb.codec.security.ISecurityType;

public class ProtocolConfiguration {
    
    private final ObjectProperty<ProtocolVersion> versionProperty = new SimpleObjectProperty<ProtocolVersion>(ProtocolVersion.RFB_3_8);
    private final StringProperty hostProperty = new SimpleStringProperty("127.0.0.1");
    private final IntegerProperty portProperty = new SimpleIntegerProperty(5900);
    private final StringProperty passwordProperty = new SimpleStringProperty();
    private final BooleanProperty sharedProperty = new SimpleBooleanProperty(true);
    private final BooleanProperty sslProperty = new SimpleBooleanProperty(false);
    private final IntegerProperty securityProperty = new SimpleIntegerProperty(ISecurityType.VNC_Auth);

    private final BooleanProperty rawEncProperty = new SimpleBooleanProperty(true);
    private final BooleanProperty copyRectEncProperty = new SimpleBooleanProperty(true);
    private final BooleanProperty hextileEncProperty = new SimpleBooleanProperty(false);
    private final BooleanProperty clientCursorProperty = new SimpleBooleanProperty(false);
    private final BooleanProperty desktopSizeProperty = new SimpleBooleanProperty(true);

    public StringProperty hostProperty() {
	return hostProperty;
    }

    public IntegerProperty portProperty() {
	return portProperty;
    }

    public StringProperty passwordProperty() {
	return passwordProperty;
    }

    public BooleanProperty sslProperty() {
	return sslProperty;
    }

    public IntegerProperty securityProperty() {
	return securityProperty;
    }

    public BooleanProperty sharedProperty() {
	return sharedProperty;
    }

    public BooleanProperty clientCursorProperty() {
	return clientCursorProperty;
    }

    public BooleanProperty rawEncProperty() {
	return rawEncProperty;
    }

    public BooleanProperty copyRectEncProperty() {
	return copyRectEncProperty;
    }

    public BooleanProperty hextileEncProperty() {
	return hextileEncProperty;
    }

    public ObjectProperty<ProtocolVersion> versionProperty() {
	return versionProperty;
    }

    public BooleanProperty desktopSizeProperty() {
	return desktopSizeProperty;
    }
    
}
