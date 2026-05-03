function InstructorDetail({ instructor }) {
    if (!instructor) {
        return (
            <div className="instructor-detail">
                <h>No instructor selected</h>
                
            </div>
        );
    }

    return (
        <div className="instructor-box">
            <h2>Selected Instructor</h2>
            <h2>{instructor.name}</h2>
            <p>
                <strong><Category></Category></strong>{instructor.Specialization}
            </p>
            <p>
                <strong><Category></Category></strong>{instructor.Status}
            </p>
            <p>
                <strong><Category></Category></strong>{instructor.YearOfExperience} years of experience
            </p>
        </div>
    );
}