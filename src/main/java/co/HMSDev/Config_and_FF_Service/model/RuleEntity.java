package co.HMSDev.Config_and_FF_Service.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "rules")
public class RuleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false, fetch = FetchType.LAZY)
    @JoinColumn(name="flag_id", nullable=false)
    private FlagEntity flag;

    @Column(nullable=false)
    private int priority = 0;

    @Column(nullable=false)
    private boolean enabled = true;

    // simplest: store JSON as string for now (later upgrade to JsonNode)
    @Column(columnDefinition = "jsonb", nullable=false)
    private String conditions = "{}";

    @Column(columnDefinition = "jsonb", nullable=false)
    private String rollout = "{}";

    @Column(name="created_at", nullable=false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    @Column(name="updated_at", nullable=false)
    private OffsetDateTime updatedAt = OffsetDateTime.now();

    protected RuleEntity() {}

    public RuleEntity(FlagEntity flag, int priority, String conditions, String rollout) {
        this.flag = flag;
        this.priority = priority;
        this.conditions = conditions;
        this.rollout = rollout;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public FlagEntity getFlag()
    {
        return flag;
    }

    public void setFlag(FlagEntity flag)
    {
        this.flag = flag;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    public String getConditions()
    {
        return conditions;
    }

    public void setConditions(String conditions)
    {
        this.conditions = conditions;
    }

    public String getRollout()
    {
        return rollout;
    }

    public void setRollout(String rollout)
    {
        this.rollout = rollout;
    }

    public OffsetDateTime getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt)
    {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt)
    {
        this.updatedAt = updatedAt;
    }
}
