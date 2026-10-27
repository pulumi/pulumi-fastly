## Shared Provider Skills

Shared skills are declared in `apm.yml` and pinned in `apm.lock.yaml`.
Run `mise install` before starting an agent. To repair a partial deployment,
run `mise deps install agent-skills --force`.

Start uncertain provider issue investigations with `triage-provider-issue`.
Shared copies under `.agents/skills/` and `.claude/skills/` are generated.
Do not edit or commit them. Maintain shared skills in
`pulumi-labs/provider-agent-skills`; keep repository-owned skills separate.
