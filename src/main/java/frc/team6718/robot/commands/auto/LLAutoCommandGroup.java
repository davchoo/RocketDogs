package frc.team6718.robot.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.team6718.robot.commands.MoveDistanceCommand;
import frc.team6718.robot.commands.TurnCommand;

public class LLAutoCommandGroup extends CommandGroup {
    public LLAutoCommandGroup() {
        addSequential(new MoveDistanceCommand(12));
        addSequential(new TurnCommand(-15));
        addSequential(new MoveDistanceCommand(111.81));
        addSequential(new TurnCommand(75));
        addSequential(new MoveDistanceCommand(60));
        addSequential(new TurnCommand(90));
        addSequential(new MoveDistanceCommand(5.75));
    }
}