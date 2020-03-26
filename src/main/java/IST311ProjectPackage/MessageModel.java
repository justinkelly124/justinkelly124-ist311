/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IST311ProjectPackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Justi
 */
@Entity
@Table(name = "MessageModel")
@NamedQueries({
    @NamedQuery(name = "MessageModel_1.findAll", query = "SELECT m FROM MessageModel_1 m"),
    @NamedQuery(name = "MessageModel_1.findByMsgContent", query = "SELECT m FROM MessageModel_1 m WHERE m.msgContent = :msgContent"),
    @NamedQuery(name = "MessageModel_1.findByMsgID", query = "SELECT m FROM MessageModel_1 m WHERE m.msgID = :msgID")})
public class MessageModel_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "msgContent")
    private String msgContent;
    @Id
    @Basic(optional = false)
    @Column(name = "msgID")
    private Long msgID;

    public MessageModel_1() {
    }

    public MessageModel_1(Long msgID) {
        this.msgID = msgID;
    }

    public MessageModel_1(Long msgID, String msgContent) {
        this.msgID = msgID;
        this.msgContent = msgContent;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Long getMsgID() {
        return msgID;
    }

    public void setMsgID(Long msgID) {
        this.msgID = msgID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (msgID != null ? msgID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessageModel_1)) {
            return false;
        }
        MessageModel_1 other = (MessageModel_1) object;
        if ((this.msgID == null && other.msgID != null) || (this.msgID != null && !this.msgID.equals(other.msgID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IST311ProjectPackage.MessageModel_1[ msgID=" + msgID + " ]";
    }
    
}
