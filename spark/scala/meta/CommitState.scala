object CommitState extends Enumeratrion {

}



sealed abstract class CommitType {
    def name: String
}

case object AppendCommit extends CommitType {}
