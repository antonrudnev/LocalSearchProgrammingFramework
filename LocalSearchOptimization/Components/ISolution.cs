﻿namespace LocalSearchOptimization.Components
{
    public interface ISolution
    {
        double CostValue { get; }

        int IterationNumber { get; set; }

        double TimeInSeconds { get; set; }

        bool IsCurrentBest { get; set; }

        bool IsFinal { get; set; }

        string DerivedByOperation { get; }

        ISolution Shuffle(int seed);
    }
}